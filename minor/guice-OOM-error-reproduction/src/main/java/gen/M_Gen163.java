
  package gen;
  public class M_Gen163 {
  		@com.google.inject.Inject
  		public M_Gen163(M_Gen164 m_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  