
  package gen;
  public class X_Gen61 {
  		@com.google.inject.Inject
  		public X_Gen61(X_Gen62 x_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  