
  package gen;
  public class W_Gen51 {
  		@com.google.inject.Inject
  		public W_Gen51(W_Gen52 w_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  