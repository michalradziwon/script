
  package gen;
  public class U_Gen80 {
  		@com.google.inject.Inject
  		public U_Gen80(U_Gen81 u_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  