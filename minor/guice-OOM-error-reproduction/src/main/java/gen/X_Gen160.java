
  package gen;
  public class X_Gen160 {
  		@com.google.inject.Inject
  		public X_Gen160(X_Gen161 x_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  