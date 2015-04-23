
  package gen;
  public class X_Gen54 {
  		@com.google.inject.Inject
  		public X_Gen54(X_Gen55 x_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  