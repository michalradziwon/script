
  package gen;
  public class U_Gen113 {
  		@com.google.inject.Inject
  		public U_Gen113(U_Gen114 u_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  