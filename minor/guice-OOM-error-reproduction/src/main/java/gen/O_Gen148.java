
  package gen;
  public class O_Gen148 {
  		@com.google.inject.Inject
  		public O_Gen148(O_Gen149 o_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  