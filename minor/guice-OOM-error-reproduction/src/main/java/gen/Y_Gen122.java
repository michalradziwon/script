
  package gen;
  public class Y_Gen122 {
  		@com.google.inject.Inject
  		public Y_Gen122(Y_Gen123 y_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  