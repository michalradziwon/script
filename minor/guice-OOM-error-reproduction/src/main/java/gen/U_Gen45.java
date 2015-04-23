
  package gen;
  public class U_Gen45 {
  		@com.google.inject.Inject
  		public U_Gen45(U_Gen46 u_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  