
  package gen;
  public class X_Gen171 {
  		@com.google.inject.Inject
  		public X_Gen171(X_Gen172 x_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  