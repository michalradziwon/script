
  package gen;
  public class Y_Gen141 {
  		@com.google.inject.Inject
  		public Y_Gen141(Y_Gen142 y_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  