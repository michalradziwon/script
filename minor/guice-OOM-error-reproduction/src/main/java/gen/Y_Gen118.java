
  package gen;
  public class Y_Gen118 {
  		@com.google.inject.Inject
  		public Y_Gen118(Y_Gen119 y_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  