
  package gen;
  public class X_Gen151 {
  		@com.google.inject.Inject
  		public X_Gen151(X_Gen152 x_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  