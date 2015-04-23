
  package gen;
  public class U_Gen124 {
  		@com.google.inject.Inject
  		public U_Gen124(U_Gen125 u_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  