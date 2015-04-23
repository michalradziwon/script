
  package gen;
  public class P_Gen116 {
  		@com.google.inject.Inject
  		public P_Gen116(P_Gen117 p_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  