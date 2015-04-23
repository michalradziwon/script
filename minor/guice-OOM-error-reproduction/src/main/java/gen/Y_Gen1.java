
  package gen;
  public class Y_Gen1 {
  		@com.google.inject.Inject
  		public Y_Gen1(Y_Gen2 y_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  