
  package gen;
  public class U_Gen115 {
  		@com.google.inject.Inject
  		public U_Gen115(U_Gen116 u_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  