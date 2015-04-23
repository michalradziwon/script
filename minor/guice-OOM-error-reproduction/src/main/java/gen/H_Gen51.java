
  package gen;
  public class H_Gen51 {
  		@com.google.inject.Inject
  		public H_Gen51(H_Gen52 h_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  