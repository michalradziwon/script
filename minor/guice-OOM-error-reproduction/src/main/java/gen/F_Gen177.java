
  package gen;
  public class F_Gen177 {
  		@com.google.inject.Inject
  		public F_Gen177(F_Gen178 f_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  