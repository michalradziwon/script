
  package gen;
  public class Y_Gen117 {
  		@com.google.inject.Inject
  		public Y_Gen117(Y_Gen118 y_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  