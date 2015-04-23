
  package gen;
  public class P_Gen18 {
  		@com.google.inject.Inject
  		public P_Gen18(P_Gen19 p_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  