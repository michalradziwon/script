
  package gen;
  public class M_Gen197 {
  		@com.google.inject.Inject
  		public M_Gen197(M_Gen198 m_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  