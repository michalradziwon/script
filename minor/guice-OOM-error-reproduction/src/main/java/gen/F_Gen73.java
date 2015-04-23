
  package gen;
  public class F_Gen73 {
  		@com.google.inject.Inject
  		public F_Gen73(F_Gen74 f_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  