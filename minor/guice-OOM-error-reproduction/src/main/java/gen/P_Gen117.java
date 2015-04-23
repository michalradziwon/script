
  package gen;
  public class P_Gen117 {
  		@com.google.inject.Inject
  		public P_Gen117(P_Gen118 p_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  