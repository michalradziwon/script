
  package gen;
  public class M_Gen29 {
  		@com.google.inject.Inject
  		public M_Gen29(M_Gen30 m_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  