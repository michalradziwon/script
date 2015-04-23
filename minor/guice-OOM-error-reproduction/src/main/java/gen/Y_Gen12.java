
  package gen;
  public class Y_Gen12 {
  		@com.google.inject.Inject
  		public Y_Gen12(Y_Gen13 y_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  