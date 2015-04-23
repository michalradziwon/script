
  package gen;
  public class F_Gen136 {
  		@com.google.inject.Inject
  		public F_Gen136(F_Gen137 f_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  