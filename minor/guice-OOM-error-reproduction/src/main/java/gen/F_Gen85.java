
  package gen;
  public class F_Gen85 {
  		@com.google.inject.Inject
  		public F_Gen85(F_Gen86 f_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  