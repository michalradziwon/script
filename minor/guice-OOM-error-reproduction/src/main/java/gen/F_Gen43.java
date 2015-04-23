
  package gen;
  public class F_Gen43 {
  		@com.google.inject.Inject
  		public F_Gen43(F_Gen44 f_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  