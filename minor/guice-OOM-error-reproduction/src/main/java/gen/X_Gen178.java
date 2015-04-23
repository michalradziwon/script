
  package gen;
  public class X_Gen178 {
  		@com.google.inject.Inject
  		public X_Gen178(X_Gen179 x_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  