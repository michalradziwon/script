
  package gen;
  public class Y_Gen106 {
  		@com.google.inject.Inject
  		public Y_Gen106(Y_Gen107 y_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  