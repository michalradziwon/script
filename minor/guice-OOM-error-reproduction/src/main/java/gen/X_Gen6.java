
  package gen;
  public class X_Gen6 {
  		@com.google.inject.Inject
  		public X_Gen6(X_Gen7 x_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  