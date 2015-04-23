
  package gen;
  public class X_Gen189 {
  		@com.google.inject.Inject
  		public X_Gen189(X_Gen190 x_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  