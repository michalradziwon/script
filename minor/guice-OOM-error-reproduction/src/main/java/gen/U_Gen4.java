
  package gen;
  public class U_Gen4 {
  		@com.google.inject.Inject
  		public U_Gen4(U_Gen5 u_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  