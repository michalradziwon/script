
  package gen;
  public class N_Gen51 {
  		@com.google.inject.Inject
  		public N_Gen51(N_Gen52 n_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  