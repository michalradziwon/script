
  package gen;
  public class O_Gen51 {
  		@com.google.inject.Inject
  		public O_Gen51(O_Gen52 o_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  