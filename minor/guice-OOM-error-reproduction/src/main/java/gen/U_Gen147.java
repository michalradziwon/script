
  package gen;
  public class U_Gen147 {
  		@com.google.inject.Inject
  		public U_Gen147(U_Gen148 u_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  