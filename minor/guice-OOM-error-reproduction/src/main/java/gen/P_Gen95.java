
  package gen;
  public class P_Gen95 {
  		@com.google.inject.Inject
  		public P_Gen95(P_Gen96 p_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  