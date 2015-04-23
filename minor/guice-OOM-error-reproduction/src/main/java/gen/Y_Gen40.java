
  package gen;
  public class Y_Gen40 {
  		@com.google.inject.Inject
  		public Y_Gen40(Y_Gen41 y_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  