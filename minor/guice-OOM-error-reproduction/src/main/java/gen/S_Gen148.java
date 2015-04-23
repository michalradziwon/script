
  package gen;
  public class S_Gen148 {
  		@com.google.inject.Inject
  		public S_Gen148(S_Gen149 s_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  