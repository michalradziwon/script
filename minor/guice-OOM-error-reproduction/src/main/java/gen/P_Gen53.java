
  package gen;
  public class P_Gen53 {
  		@com.google.inject.Inject
  		public P_Gen53(P_Gen54 p_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  