
  package gen;
  public class Y_Gen119 {
  		@com.google.inject.Inject
  		public Y_Gen119(Y_Gen120 y_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  