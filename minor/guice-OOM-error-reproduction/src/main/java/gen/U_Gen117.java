
  package gen;
  public class U_Gen117 {
  		@com.google.inject.Inject
  		public U_Gen117(U_Gen118 u_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  