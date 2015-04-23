
  package gen;
  public class U_Gen5 {
  		@com.google.inject.Inject
  		public U_Gen5(U_Gen6 u_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  