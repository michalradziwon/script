
  package gen;
  public class Y_Gen51 {
  		@com.google.inject.Inject
  		public Y_Gen51(Y_Gen52 y_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  