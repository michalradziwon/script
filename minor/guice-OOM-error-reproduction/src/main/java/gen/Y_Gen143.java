
  package gen;
  public class Y_Gen143 {
  		@com.google.inject.Inject
  		public Y_Gen143(Y_Gen144 y_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  