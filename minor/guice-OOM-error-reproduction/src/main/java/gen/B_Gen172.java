
  package gen;
  public class B_Gen172 {
  		@com.google.inject.Inject
  		public B_Gen172(B_Gen173 b_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  