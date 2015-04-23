
  package gen;
  public class X_Gen159 {
  		@com.google.inject.Inject
  		public X_Gen159(X_Gen160 x_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  