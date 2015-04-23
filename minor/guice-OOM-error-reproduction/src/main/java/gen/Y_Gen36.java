
  package gen;
  public class Y_Gen36 {
  		@com.google.inject.Inject
  		public Y_Gen36(Y_Gen37 y_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  