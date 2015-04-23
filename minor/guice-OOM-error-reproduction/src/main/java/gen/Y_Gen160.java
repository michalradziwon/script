
  package gen;
  public class Y_Gen160 {
  		@com.google.inject.Inject
  		public Y_Gen160(Y_Gen161 y_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  