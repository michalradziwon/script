
  package gen;
  public class B_Gen148 {
  		@com.google.inject.Inject
  		public B_Gen148(B_Gen149 b_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  