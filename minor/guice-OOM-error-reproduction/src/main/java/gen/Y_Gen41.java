
  package gen;
  public class Y_Gen41 {
  		@com.google.inject.Inject
  		public Y_Gen41(Y_Gen42 y_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  