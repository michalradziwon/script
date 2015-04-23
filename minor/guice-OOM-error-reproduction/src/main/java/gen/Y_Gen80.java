
  package gen;
  public class Y_Gen80 {
  		@com.google.inject.Inject
  		public Y_Gen80(Y_Gen81 y_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  