
  package gen;
  public class U_Gen93 {
  		@com.google.inject.Inject
  		public U_Gen93(U_Gen94 u_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  