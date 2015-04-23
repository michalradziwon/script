
  package gen;
  public class P_Gen6 {
  		@com.google.inject.Inject
  		public P_Gen6(P_Gen7 p_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  