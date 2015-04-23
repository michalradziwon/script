
  package gen;
  public class F_Gen93 {
  		@com.google.inject.Inject
  		public F_Gen93(F_Gen94 f_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  