
  package gen;
  public class F_Gen135 {
  		@com.google.inject.Inject
  		public F_Gen135(F_Gen136 f_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  