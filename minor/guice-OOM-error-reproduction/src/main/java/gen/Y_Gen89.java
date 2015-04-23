
  package gen;
  public class Y_Gen89 {
  		@com.google.inject.Inject
  		public Y_Gen89(Y_Gen90 y_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  