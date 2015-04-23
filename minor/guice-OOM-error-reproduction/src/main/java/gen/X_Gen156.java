
  package gen;
  public class X_Gen156 {
  		@com.google.inject.Inject
  		public X_Gen156(X_Gen157 x_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  