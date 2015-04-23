
  package gen;
  public class D_Gen148 {
  		@com.google.inject.Inject
  		public D_Gen148(D_Gen149 d_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  