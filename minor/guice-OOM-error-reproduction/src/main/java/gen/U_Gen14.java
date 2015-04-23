
  package gen;
  public class U_Gen14 {
  		@com.google.inject.Inject
  		public U_Gen14(U_Gen15 u_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  