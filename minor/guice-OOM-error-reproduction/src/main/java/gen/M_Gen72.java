
  package gen;
  public class M_Gen72 {
  		@com.google.inject.Inject
  		public M_Gen72(M_Gen73 m_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  