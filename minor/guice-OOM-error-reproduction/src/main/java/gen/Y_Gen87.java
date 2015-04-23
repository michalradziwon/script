
  package gen;
  public class Y_Gen87 {
  		@com.google.inject.Inject
  		public Y_Gen87(Y_Gen88 y_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  