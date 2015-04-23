
  package gen;
  public class X_Gen164 {
  		@com.google.inject.Inject
  		public X_Gen164(X_Gen165 x_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  