
  package gen;
  public class J_Gen148 {
  		@com.google.inject.Inject
  		public J_Gen148(J_Gen149 j_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  