
  package gen;
  public class M_Gen174 {
  		@com.google.inject.Inject
  		public M_Gen174(M_Gen175 m_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  