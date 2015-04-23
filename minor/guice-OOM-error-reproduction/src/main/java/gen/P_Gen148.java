
  package gen;
  public class P_Gen148 {
  		@com.google.inject.Inject
  		public P_Gen148(P_Gen149 p_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  