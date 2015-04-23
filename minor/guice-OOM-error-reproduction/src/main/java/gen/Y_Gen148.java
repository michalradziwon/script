
  package gen;
  public class Y_Gen148 {
  		@com.google.inject.Inject
  		public Y_Gen148(Y_Gen149 y_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  