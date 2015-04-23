
  package gen;
  public class X_Gen173 {
  		@com.google.inject.Inject
  		public X_Gen173(X_Gen174 x_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  