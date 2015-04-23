
  package gen;
  public class X_Gen13 {
  		@com.google.inject.Inject
  		public X_Gen13(X_Gen14 x_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  