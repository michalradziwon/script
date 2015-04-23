
  package gen;
  public class Y_Gen88 {
  		@com.google.inject.Inject
  		public Y_Gen88(Y_Gen89 y_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  