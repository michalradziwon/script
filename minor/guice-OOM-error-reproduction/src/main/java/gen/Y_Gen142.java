
  package gen;
  public class Y_Gen142 {
  		@com.google.inject.Inject
  		public Y_Gen142(Y_Gen143 y_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  