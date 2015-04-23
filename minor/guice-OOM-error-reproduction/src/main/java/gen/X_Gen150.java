
  package gen;
  public class X_Gen150 {
  		@com.google.inject.Inject
  		public X_Gen150(X_Gen151 x_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  