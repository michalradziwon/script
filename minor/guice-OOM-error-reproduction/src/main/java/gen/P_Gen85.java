
  package gen;
  public class P_Gen85 {
  		@com.google.inject.Inject
  		public P_Gen85(P_Gen86 p_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  