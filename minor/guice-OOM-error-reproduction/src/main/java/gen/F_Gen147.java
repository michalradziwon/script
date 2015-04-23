
  package gen;
  public class F_Gen147 {
  		@com.google.inject.Inject
  		public F_Gen147(F_Gen148 f_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  