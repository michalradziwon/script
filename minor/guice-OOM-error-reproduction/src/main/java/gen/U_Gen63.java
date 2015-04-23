
  package gen;
  public class U_Gen63 {
  		@com.google.inject.Inject
  		public U_Gen63(U_Gen64 u_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  