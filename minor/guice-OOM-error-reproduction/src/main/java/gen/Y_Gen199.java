
  package gen;
  public class Y_Gen199 {
  		@com.google.inject.Inject
  		public Y_Gen199(Y_Gen200 y_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  