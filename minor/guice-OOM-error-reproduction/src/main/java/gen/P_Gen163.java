
  package gen;
  public class P_Gen163 {
  		@com.google.inject.Inject
  		public P_Gen163(P_Gen164 p_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  