
  package gen;
  public class X_Gen148 {
  		@com.google.inject.Inject
  		public X_Gen148(X_Gen149 x_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  