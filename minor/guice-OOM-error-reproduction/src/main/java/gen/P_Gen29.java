
  package gen;
  public class P_Gen29 {
  		@com.google.inject.Inject
  		public P_Gen29(P_Gen30 p_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  