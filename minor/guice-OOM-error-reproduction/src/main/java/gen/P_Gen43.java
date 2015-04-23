
  package gen;
  public class P_Gen43 {
  		@com.google.inject.Inject
  		public P_Gen43(P_Gen44 p_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  