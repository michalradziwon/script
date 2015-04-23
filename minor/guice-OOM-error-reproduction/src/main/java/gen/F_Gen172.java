
  package gen;
  public class F_Gen172 {
  		@com.google.inject.Inject
  		public F_Gen172(F_Gen173 f_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  