
  package gen;
  public class X_Gen44 {
  		@com.google.inject.Inject
  		public X_Gen44(X_Gen45 x_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  