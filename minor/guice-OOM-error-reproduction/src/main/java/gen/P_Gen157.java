
  package gen;
  public class P_Gen157 {
  		@com.google.inject.Inject
  		public P_Gen157(P_Gen158 p_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  