
  package gen;
  public class X_Gen60 {
  		@com.google.inject.Inject
  		public X_Gen60(X_Gen61 x_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  