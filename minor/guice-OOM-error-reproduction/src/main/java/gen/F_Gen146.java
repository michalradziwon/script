
  package gen;
  public class F_Gen146 {
  		@com.google.inject.Inject
  		public F_Gen146(F_Gen147 f_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  