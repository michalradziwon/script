
  package gen;
  public class L_Gen51 {
  		@com.google.inject.Inject
  		public L_Gen51(L_Gen52 l_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  