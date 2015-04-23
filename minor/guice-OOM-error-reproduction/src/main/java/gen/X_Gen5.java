
  package gen;
  public class X_Gen5 {
  		@com.google.inject.Inject
  		public X_Gen5(X_Gen6 x_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  