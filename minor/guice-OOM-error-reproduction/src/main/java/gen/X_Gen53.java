
  package gen;
  public class X_Gen53 {
  		@com.google.inject.Inject
  		public X_Gen53(X_Gen54 x_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  