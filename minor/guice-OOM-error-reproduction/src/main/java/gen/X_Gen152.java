
  package gen;
  public class X_Gen152 {
  		@com.google.inject.Inject
  		public X_Gen152(X_Gen153 x_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  