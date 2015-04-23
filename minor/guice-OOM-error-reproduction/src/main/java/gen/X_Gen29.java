
  package gen;
  public class X_Gen29 {
  		@com.google.inject.Inject
  		public X_Gen29(X_Gen30 x_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  