
  package gen;
  public class Y_Gen95 {
  		@com.google.inject.Inject
  		public Y_Gen95(Y_Gen96 y_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  