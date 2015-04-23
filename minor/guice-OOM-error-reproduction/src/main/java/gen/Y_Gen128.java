
  package gen;
  public class Y_Gen128 {
  		@com.google.inject.Inject
  		public Y_Gen128(Y_Gen129 y_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  