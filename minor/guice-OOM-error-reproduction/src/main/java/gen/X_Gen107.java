
  package gen;
  public class X_Gen107 {
  		@com.google.inject.Inject
  		public X_Gen107(X_Gen108 x_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  