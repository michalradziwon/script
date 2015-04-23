
  package gen;
  public class X_Gen162 {
  		@com.google.inject.Inject
  		public X_Gen162(X_Gen163 x_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  