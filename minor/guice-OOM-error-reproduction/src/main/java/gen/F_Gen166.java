
  package gen;
  public class F_Gen166 {
  		@com.google.inject.Inject
  		public F_Gen166(F_Gen167 f_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  