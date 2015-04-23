
  package gen;
  public class Y_Gen2 {
  		@com.google.inject.Inject
  		public Y_Gen2(Y_Gen3 y_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  