
  package gen;
  public class Y_Gen37 {
  		@com.google.inject.Inject
  		public Y_Gen37(Y_Gen38 y_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  