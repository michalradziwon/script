
  package gen;
  public class P_Gen166 {
  		@com.google.inject.Inject
  		public P_Gen166(P_Gen167 p_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  