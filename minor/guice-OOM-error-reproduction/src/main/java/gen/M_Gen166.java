
  package gen;
  public class M_Gen166 {
  		@com.google.inject.Inject
  		public M_Gen166(M_Gen167 m_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  