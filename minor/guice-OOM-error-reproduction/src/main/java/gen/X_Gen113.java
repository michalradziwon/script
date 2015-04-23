
  package gen;
  public class X_Gen113 {
  		@com.google.inject.Inject
  		public X_Gen113(X_Gen114 x_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  