
  package gen;
  public class P_Gen94 {
  		@com.google.inject.Inject
  		public P_Gen94(P_Gen95 p_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  