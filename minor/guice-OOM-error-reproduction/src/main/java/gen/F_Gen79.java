
  package gen;
  public class F_Gen79 {
  		@com.google.inject.Inject
  		public F_Gen79(F_Gen80 f_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  