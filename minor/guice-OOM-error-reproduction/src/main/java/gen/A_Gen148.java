
  package gen;
  public class A_Gen148 {
  		@com.google.inject.Inject
  		public A_Gen148(A_Gen149 a_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  