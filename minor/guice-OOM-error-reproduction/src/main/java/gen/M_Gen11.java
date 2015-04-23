
  package gen;
  public class M_Gen11 {
  		@com.google.inject.Inject
  		public M_Gen11(M_Gen12 m_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  