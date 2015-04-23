
  package gen;
  public class Y_Gen14 {
  		@com.google.inject.Inject
  		public Y_Gen14(Y_Gen15 y_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  