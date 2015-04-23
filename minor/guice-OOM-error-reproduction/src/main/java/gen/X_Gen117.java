
  package gen;
  public class X_Gen117 {
  		@com.google.inject.Inject
  		public X_Gen117(X_Gen118 x_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  