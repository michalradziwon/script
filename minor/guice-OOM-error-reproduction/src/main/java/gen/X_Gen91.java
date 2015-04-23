
  package gen;
  public class X_Gen91 {
  		@com.google.inject.Inject
  		public X_Gen91(X_Gen92 x_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  