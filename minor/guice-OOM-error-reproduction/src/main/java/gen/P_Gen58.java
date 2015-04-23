
  package gen;
  public class P_Gen58 {
  		@com.google.inject.Inject
  		public P_Gen58(P_Gen59 p_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  