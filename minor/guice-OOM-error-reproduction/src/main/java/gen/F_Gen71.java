
  package gen;
  public class F_Gen71 {
  		@com.google.inject.Inject
  		public F_Gen71(F_Gen72 f_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  