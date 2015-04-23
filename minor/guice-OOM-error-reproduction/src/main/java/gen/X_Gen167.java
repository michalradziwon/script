
  package gen;
  public class X_Gen167 {
  		@com.google.inject.Inject
  		public X_Gen167(X_Gen168 x_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  