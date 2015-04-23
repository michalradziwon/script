
  package gen;
  public class P_Gen93 {
  		@com.google.inject.Inject
  		public P_Gen93(P_Gen94 p_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  