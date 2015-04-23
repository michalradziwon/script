
  package gen;
  public class P_Gen113 {
  		@com.google.inject.Inject
  		public P_Gen113(P_Gen114 p_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  