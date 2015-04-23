
  package gen;
  public class Y_Gen11 {
  		@com.google.inject.Inject
  		public Y_Gen11(Y_Gen12 y_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  