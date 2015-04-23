
  package gen;
  public class X_Gen146 {
  		@com.google.inject.Inject
  		public X_Gen146(X_Gen147 x_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  