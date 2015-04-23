
  package gen;
  public class X_Gen184 {
  		@com.google.inject.Inject
  		public X_Gen184(X_Gen185 x_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  