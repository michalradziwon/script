
  package gen;
  public class P_Gen184 {
  		@com.google.inject.Inject
  		public P_Gen184(P_Gen185 p_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  