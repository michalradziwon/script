
  package gen;
  public class U_Gen73 {
  		@com.google.inject.Inject
  		public U_Gen73(U_Gen74 u_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  