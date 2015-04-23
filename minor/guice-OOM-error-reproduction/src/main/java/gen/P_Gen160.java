
  package gen;
  public class P_Gen160 {
  		@com.google.inject.Inject
  		public P_Gen160(P_Gen161 p_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  