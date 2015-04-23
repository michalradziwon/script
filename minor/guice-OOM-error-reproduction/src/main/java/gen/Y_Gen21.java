
  package gen;
  public class Y_Gen21 {
  		@com.google.inject.Inject
  		public Y_Gen21(Y_Gen22 y_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  