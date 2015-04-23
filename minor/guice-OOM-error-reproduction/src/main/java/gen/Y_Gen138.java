
  package gen;
  public class Y_Gen138 {
  		@com.google.inject.Inject
  		public Y_Gen138(Y_Gen139 y_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  