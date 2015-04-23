
  package gen;
  public class P_Gen51 {
  		@com.google.inject.Inject
  		public P_Gen51(P_Gen52 p_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  