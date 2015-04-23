
  package gen;
  public class F_Gen48 {
  		@com.google.inject.Inject
  		public F_Gen48(F_Gen49 f_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  