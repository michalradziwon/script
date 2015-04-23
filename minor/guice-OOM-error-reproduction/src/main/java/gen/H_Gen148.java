
  package gen;
  public class H_Gen148 {
  		@com.google.inject.Inject
  		public H_Gen148(H_Gen149 h_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  