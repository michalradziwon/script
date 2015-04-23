
  package gen;
  public class X_Gen158 {
  		@com.google.inject.Inject
  		public X_Gen158(X_Gen159 x_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  