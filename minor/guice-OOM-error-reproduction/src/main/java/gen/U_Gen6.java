
  package gen;
  public class U_Gen6 {
  		@com.google.inject.Inject
  		public U_Gen6(U_Gen7 u_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  