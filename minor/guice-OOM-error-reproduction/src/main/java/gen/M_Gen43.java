
  package gen;
  public class M_Gen43 {
  		@com.google.inject.Inject
  		public M_Gen43(M_Gen44 m_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  