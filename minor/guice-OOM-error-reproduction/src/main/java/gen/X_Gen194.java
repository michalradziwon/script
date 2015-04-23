
  package gen;
  public class X_Gen194 {
  		@com.google.inject.Inject
  		public X_Gen194(X_Gen195 x_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  