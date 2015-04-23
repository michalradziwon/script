
  package gen;
  public class U_Gen130 {
  		@com.google.inject.Inject
  		public U_Gen130(U_Gen131 u_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  