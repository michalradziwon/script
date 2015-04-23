
  package gen;
  public class P_Gen153 {
  		@com.google.inject.Inject
  		public P_Gen153(P_Gen154 p_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  