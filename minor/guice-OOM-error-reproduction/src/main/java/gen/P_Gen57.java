
  package gen;
  public class P_Gen57 {
  		@com.google.inject.Inject
  		public P_Gen57(P_Gen58 p_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  